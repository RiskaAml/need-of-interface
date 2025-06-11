interface Game{
    void play();
}
class MobileLegend implements Game{
    
    public void play(){
        System.out.println("Playing Mobile legend");
    }
}
class GenshinImpact implements Game{
    public void play(){
        System.out.println("Playing Genshin impact");
    }
}
class Player{
    public void playGame(Game game){
        game.play();
    }
}
public class Main {
    public static void main(String[] args) {
        Game obj1 = new MobileLegend();
        Game obj2 = new GenshinImpact();
        
        Player kai = new Player();
        kai.playGame(obj2);
    }
    
}
