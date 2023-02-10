package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {
    public int allocate(IResource resource) {
        int resourceId = resource.findFreeSlot();
        markAsBusy(resourceId);
        return resourceId;
    }

    public void free(IResource resource, int resourceId) {
        resource.markAsFree();
    }

    public IResource getResourceById(int resourceId) {
        return null;
    }

    public void freeResource(int resourceId) {
        getResourceById(resourceId).markAsFree();
    }

    public void markAsBusy(int resourceId) {
        getResourceById(resourceId).markAsBusy();
    }
}
