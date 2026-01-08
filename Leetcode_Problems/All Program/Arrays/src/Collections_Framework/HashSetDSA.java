package Collections_Framework;

public class HashSetDSA
{
    int id ;
    String name ;


    public HashSetDSA()
    {

    }

    public HashSetDSA(String name, int id)
    {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return name+" ,"+id;
    }
}
