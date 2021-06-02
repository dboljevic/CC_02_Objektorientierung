package at.dbo.cc.objects.musiker;

public class Saenger extends Musiker {
    public Saenger(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void singenSolo(){
        System.out.println("Buddy, you're a boy, make a big noise");
    }

}
