package at.dbo.cc.objects.musiker;

public class Bassist extends Musiker{
    public Bassist (String name, int alter) {
        super(name, alter);
    }

    @Override
    public void singenSolo(){
        System.out.println("Kicking your can all over the place, singin'");
    }
}
