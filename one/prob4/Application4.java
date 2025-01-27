/*
4. Parameterized Constructors 
Create a class One and make a parameterized constructor One( int x){ } inside this class. 
Create a class Two derived from One: class Two extends One { }. Now, compile One and 
then Two. Discuss the results with your instructor. Hint: Class Two should not compile 
and must throw an error. Analyze the error and rectify it.
*/




class One 
{
    One(int x)
    {
        System.out.println("One's Constructor: " + x);
    }
}

class Two extends One 
{
    Two(int x) 
    {
        super(x);
        System.out.println("Two's Constructor: " + x);
    }
}

class Application4
{
    public static void main(String[] args) 
   {
        Two t = new Two(10);
    }
}
