package at.dbo.cc.objects.musiker;

public class Gitarrist extends Musiker{
    public Gitarrist (String name, int alter) {
        super(name, alter);
    }

    @Override
    public void singenSolo(){
        System.out.println("Playing in the street, gonna be a big man someday");
    }
}
