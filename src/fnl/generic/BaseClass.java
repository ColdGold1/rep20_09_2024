package fnl.generic;

public class BaseClass {

    public final void recommendedMethod(){

        System.out.println("[BaseClass.recommendedMethod()]: Best Way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod() {
        System.out.println("[BaseClass.optionalMethod()]: Customise Optional Method");
    }

    private void mandatoryMethod(){
        System.out.println("[BaseClass.mandatoryMethod()]: NON-NEGOTIABLE]");
    }

    public static void recommendedStatic(){
        System.out.println("[BaseClass: recommendStatic]: Best way to do");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic(){
        System.out.println("[BaseClass: optionalStatic]: Optional");
    }

    private static void mandatoryStatic(){
        System.out.println("[BaseClass: mandatoryStatic]: MANDATORY");
    }
}
