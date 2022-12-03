package Card;

public class card {
   int number ;
    int color ;//1为♥,2为♦,3为♠,4为♣
    int weight;//设置权值
    boolean exitCard = true;    //牌存在为:true

    public card(int number, int color,int weight) {
        this.number = number;
        this.color = color;
        this.weight=weight;
    }



    @Override
    public String toString() {
        return "card" + color +number +weight;



    }
}
