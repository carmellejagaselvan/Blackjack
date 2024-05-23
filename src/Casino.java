public class Casino {
    public static void main(String[] args) {
        Casino vegas = new Casino();
        //System.out.println("Welcome to Vegas");
    }

    public Card AceOfSpades;
    public Card parkingLot;
    public Card[] Deck;
    public int counter;

    public Casino(){
        //System.out.println("the home of molly gooch money");
        //AceOfSpades = new Card(1,1);
        //AceOfSpades.printInfo();
        Deck = new Card[52];
        System.out.println("Our og deck is below");

        for(int x=0; x<4; x=x+1) {//outer loop changes suitNum
            for (int i = 1; i < 14; i = i + 1) {//inner loop changes cardNum
                Deck[counter] = new Card(i, x);
                counter = counter+1;

//            for(int x = 14; x<27; x=x+1){
//                Deck[x-1] = new Card(i, 1);
//            }
//            for(int x=28; x<40; x=x+1){
//                Deck[x-1] = new Card(i, 2);
//            }
//            for(int x=41; x<53; x=x+1){
//                Deck[x-1] = new Card(i, 3);
//            }
            }
        }
        for(int x=0; x<52; x=x+1){
            Deck[x].printInfo();
        }

        System.out.println("Our shuffled deck is below: ");
        shuffle();
        for(int x=0; x<52; x=x+1) {
            Deck[x].printInfo();
        }
    }

    public void shuffle(){
        parkingLot = Deck[0];
        Deck[0]=Deck[1];
        Deck[1] = parkingLot;
        int randNum;
        randNum = (int)(Math.random()*52);

        for(int x=0; x<52; x=x+1){
            parkingLot = Deck[0];
            Deck[0] = Deck[randNum];
            Deck[randNum] = Deck[x];


        }

    }
}
