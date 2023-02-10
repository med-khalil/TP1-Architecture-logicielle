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

### Exercise

#### How does the initial implementation violate the LSP
#### How did we fix it?
![LSP](/out/LSP/ClassDiagramLSP/ClassDiagramLSP.png?raw=true "LSP")

## Interface Segregation Principle -ISP
### Defintion

### Exercise

#### How does the initial implementation violate the ISP
#### How did we fix it?
![ISP](/out/ISP/ClassDiagramISP/ClassDiagramISP.png?raw=true "ISP")

## Dependency Inversion Principle - DIP
### Defintion

### Exercise

#### How does the initial implementation violate the ISP
#### How did we fix it?
![DIP](/out/DIP/ClassDiagramDIP/ClassDiagramDIP.png?raw=true "DIP")