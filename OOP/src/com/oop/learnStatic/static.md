- static is not related to objects
- to access a static variable, just use the class name as they are unrelated to objects.
- it will work with 'this' also (for accessing static variables), but the convention is to use class name.
- also which printing or doing anything with static variables, do not use references/objects, but rather the class name...it will work like that also but the convention suggests to use the class name
    e.g. sout(sanny.population) will work but sout(Human.population) is better.
- when a member is declared static, it can be accessed before any reference of that class is created and without referencing to that object.
- static things are not dependent on objects.


- if main is the first thing that is run, then we cant do anything without it being static...so we should be able to run the main function without creating any object of the class...this is my the main method is static.
- static methods belong to the class, and not the object.

## Non-static member inside a static
- you cannot call a non-static method without an object.
- in better terms, inside a static method, you cannot use anything that is not static.
- we know that something which is not static belongs to an object, hence it is quite meaningless to try to access that thing without knowing which instance of the class you are talking about.
- basically if something doesnt depend on instances, then how can you have something inside it that depends on instances.

## Static member inside a non-static
- this is totally fine.
- kyuki it does not limit itself.
- a static member belongs to the class, toh it doesnt really matter ki kidhar se bula rhe usko.

## non-static member inside non-static
- you can call a non-static method from a non-static method, kyuki the object for it is anyways going to be created when the calling method is called somewhere.


## IDK
- you dont need to use this keyword for static methods...vahi same variable wala case.
- you can use className.methodName()

## Crazy Shit
- you cannot use 'this' keyword inside static methods.

## Initialization of static variables
- done using something called a *STATIC BLOCK*
- the static block gets executed exactly once when the class is first loaded i.e. when the first object is created.