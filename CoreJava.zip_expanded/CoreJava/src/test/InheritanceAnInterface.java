package test;



//class and inteface basics

public class InheritanceAnInterface {

}

class InheritanceAnInterface2 {

}

class InheritanceAnInterface3 extends InheritanceAnInterface // InheritanceAnInterface2(not support)

{

}

interface abc {

}

interface wxy {

}

interface xyz extends abc, wxy // interface support
{

}

class InheritanceAnInterface_I3 implements abc, wxy

{

}