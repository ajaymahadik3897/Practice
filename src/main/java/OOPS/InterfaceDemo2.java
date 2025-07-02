package OOPS;
//Multiple inheritance is not allowed in Java, but we can achieve it using interfaces.

interface print {  //100% abstraction // interface is a contract that defines a set of methods that a class must implement
    void print();  // method in interface
}

interface scan {
    void scan();  // method in interface
}

interface fax {
    void fax();  // method in interface
}



public class InterfaceDemo2 implements print , scan, fax {  // implementing multiple interfaces //multiple inheritance is achieved through interfaces

    @Override
     public void print() {  // implementing the print method from print interface
        System.out.println("Printing document");
    }

    @Override
    public void scan() {  // implementing the scan method from scan interface
        System.out.println("Scanning document");
    }

    @Override
     public void fax() {  // implementing the fax method from fax interface
        System.out.println("Faxing document");
    }

    public static void main(String[] args) {
        InterfaceDemo2 obj = new InterfaceDemo2();  // creating an instance of InterfaceDemo2
        obj.print();  // calling the print method
        obj.scan();   // calling the scan method
        obj.fax();    // calling the fax method
    }
}
