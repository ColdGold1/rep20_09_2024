package consumer.specific;

import fnl.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[ChildClass: optionalMethod]: Extra Stuff Happened");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//
//        System.out.println("[ChildClass: recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    public static void recommendedStatic(){
        System.out.println("[ChildClass: recommendStatic]: Best way to do");
        optionalStatic();
//        mandatoryStatic();
    }
}
