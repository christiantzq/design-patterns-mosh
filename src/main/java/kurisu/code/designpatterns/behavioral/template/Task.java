package kurisu.code.designpatterns.behavioral.template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }
    
    public void execute(){
        auditTrail.record();
        doExecute();
        System.out.println("Commited.");
    }

    protected abstract void doExecute();
}
