# TP1 SOLID Principals
## Group:
- Med Khalil Ben Abdallah
- Youssef Smaoui

## Single Responsibility Principal -SRP
### Defintion

One class should serve only one purpose. When a class serves multiple purposes or responsibilities, it should be made into a new class.
### Exercise
#### How does the initial implementation violate the SRP
The initial CarManager class handle more than one role: 
1. it handle getting the car data from DB layer 
2. it handles how we format the car names
3. it handles how we compare different cars and get the best one

Since we can find more than one reason to change the CarManager class it clearly violate the SRP 
#### How did we fix it?
We extracted the 2 method reponsible for formatting the car names and companring between different cars into their own class (CarComparer and CarFormater and both depend on the carmanager)

![SRP](/out/SRP/ClassDiagramSRP/ClassDiagramSRP.png?raw=true "SRP")

## Open Close Principal -OCP
### Defintion
Classes should be open for extension, but closed for modification. Thepurpose of this principle is being able to extend a Class’s behaviour withoutchanging the existing behaviour of that Class.
### Exercise

#### How does the initial implementation violate the OCP
#### How did we fix it?

![OCP](/out/OCP/ClassDiagramOCP/ClassDiagramOCP.png?raw=true "OCP")

## Liskov Substitution Principle -LSP
### Defintion
Any objects of a superclass shall be replaceable with an objects of its subclasses without breaking the application. 

That requires the objects of subclasses to behave in the same way as the objects of the superclass.
### Exercise
#### How does the initial implementation violate the LSP
In the initial design ElectronicDuck did inherit formm Duck however the overiden method in the ElectronicDuck subclass (inherited from Duck) need specific logic that is only present inside the ElectronicDuck class to funtion (_on being set to true). 

This break the  LSP principal since we can't substitue Duck by ElectronicDuck inside the pool class without breaking our program

#### How did we fix it?
We made sure that the design respect the LSP principal by renaming Duck to LivingDuck and breaking the inheritance relationship between LivingDuck and ElectronicDuck (now both implement the interface IDuck without ElectronicDuck inheriting from Duck)

![LSP](/out/LSP/ClassDiagramLSP/ClassDiagramLSP.png?raw=true "LSP")

## Interface Segregation Principle -ISP
### Defintion
The interface segregation principle (ISP) states that no code should be forced to depend on methods it does not use. 

ISP splits interfaces that are very large into smaller and more specific ones so that clients will only have to know about the methods that are of interest to them
### Exercise

#### How does the initial implementation violate the ISP
initially both TimedDoor and SensingDoor both implement the Door interface which contains 2 methods proximityCallback() and timeOutCallback() that are not used by both class
#### How did we fix it?
We extracted the the 2 methods that are not used by all interface implementations into the 2 different correponding interfaces to make sure to respect the ISP

![ISP](/out/ISP/ClassDiagramISP/ClassDiagramISP.png?raw=true "ISP")

## Dependency Inversion Principle - DIP
### Defintion
High-level modules, which provide complex logic, should be easily reusable and unaffected by changes in low-level modules, which provide utility features.

To achieve those result we should follow those 2 rules 
1. High-level modules should not depend on low-level modules. Both should depend on abstractions.

2. Abstractions should not depend on details. Details should depend on abstractions.

### Exercise

#### How does the initial implementation violate the ISP
MyDatabase and the encoding are 2 utility features (low level) that we may decide to change at some point in time. 

Initially it is clear that the encoding moduleClient and that EncodingBasedOnNetworkAndDatabaseModule are highly coupled respectively with MyDatabase and the both Encoding class making any future change difficult if the app become more complex.
#### How did we fix it?
To fix this issue we applied DIP by introducing a layer of abstraction (IEncode and IDatabase) to make sure that both high level and low level code depend only on abstraction.

![DIP](/out/DIP/ClassDiagramDIP/ClassDiagramDIP.png?raw=true "DIP")