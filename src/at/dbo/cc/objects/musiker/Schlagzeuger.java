package at.dbo.cc.objects.musiker;

public class Schlagzeuger extends Musiker{
    public Schlagzeuger(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void singenSolo(){
        System.out.println("You got mud on your face, you big disgrace");
    }
}
