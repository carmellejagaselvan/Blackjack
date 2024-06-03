public class Casino {
    public static void main(String[] args) {
        Casino vegas = new Casino();
        //System.out.println("Welcome to Vegas");
    }

    public Card AceOfSpades;
    public Card parkingLot;
    public Card[] Deck;
    public int counter;
    public Player[] gamblers;
    public Player dealer;
    public int dealCounter = 2;

    public Casino(){
        //System.out.println("the home of molly gooch money");
        //AceOfSpades = new Card(1,1);
        //AceOfSpades.printInfo();
        Deck = new Card[52];
        gamblers = new Player[3];
        System.out.println("Our og deck is below");

        dealer = new Player(0);

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

        for (int x=0; x<3; x=x+1){
            gamblers[x] = new Player(x+1);
        }

        deal();
        dealer.printInfo();

        for(int x=0; x<3; x=x+1){
            gamblers[x].printInfo();
        }


    }

    public void deal(){
        dealer.hand[0] = Deck[0];
        dealer.hand[1] = Deck[1];
        for(int x=0; x<gamblers.length; x++){
            for(int y=0; y<gamblers[y].hand.length; y++){
              gamblers[x].hand[y] = Deck[dealCounter];
              dealCounter = dealCounter +1;
            }
        }

    }

    public void shuffle(){
        parkingLot = Deck[0];
        Deck[0]=Deck[1];
        Deck[1] = parkingLot;


        for(int x=0; x<52; x=x+1){
            int randNum;
            randNum = (int)(Math.random()*52);
            parkingLot = Deck[x];
            Deck[x] = Deck[randNum];
            Deck[randNum] = parkingLot;
        }

    }
}

//Syntax
//how to refer to a single player from my players array?
//players[2].printInfo();
//how to refer to the 0th card of the hand of the 0th player?
//players[0].hand[0]
