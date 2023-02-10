package com.directi.training.ocp.exercise_refactored;

public interface IResource {
    public void markAsFree();

    public void markAsBusy();

    public int findFreeSlot();
}
