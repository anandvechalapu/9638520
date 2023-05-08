trigger LookupMasterTrigger on Lookup_Master__c (after insert, after update, after delete) { 
    List<Id> lookupIds = new List<Id>();
    
    //If the Lookup Master is being inserted
    if (Trigger.isInsert) { 
        for (Lookup_Master__c lookup : Trigger.new) {
            lookupIds.add(lookup.Id);
        }
    } 
    
    //If the Lookup Master is being updated
    else if (Trigger.isUpdate) { 
        for (Lookup_Master__c lookup : Trigger.new) {
            lookupIds.add(lookup.Id);
        }
    } 
    
    //If the Lookup Master is being deleted
    else if (Trigger.isDelete) { 
        for (Lookup_Master__c lookup : Trigger.old) {
            lookupIds.add(lookup.Id);
        }
    }
    
    //Query all the references to the Lookup Master
    List<Lookup_Master_Reference__c> refs = [SELECT Id, Lookup_Master__c FROM Lookup_Master_Reference__c WHERE Lookup_Master__c IN :lookupIds];
    
    //Update all the references to the Lookup Master
    for (Lookup_Master_Reference__c ref : refs) {
        ref.Lookup_Master__c = Trigger.newMap.get(ref.Lookup_Master__c).Id;
    }
    update refs;
}