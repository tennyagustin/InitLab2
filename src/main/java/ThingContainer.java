//import java.util.ArrayList;

/**
 * Created by Tenny on 2/4/16.
 */
public class ThingContainer {


    static ColorfulThing[] ctArray = new ColorfulThing[3]; //Array of ColorfulThing
    int thingLimit;
    boolean full = false;

    static ColorfulThing add() {

        for (int i = 0; i < ctArray.length; i++) {
            if (ctArray[i] == null) {
                ctArray[i] = new ColorfulThing(Color.values()[i]);

                System.out.println(ctArray[i].color);

                return ThingContainer.ctArray[i];
            }
        }
        System.out.println("Cannot add ColorfulThing.");
        return null; //if every spot is full
    }

    static ColorfulThing remove(Color x) {

        for(int i = 0; i < ctArray.length; i++) {

            if (ctArray[i].getColor() == x) {
                System.out.println("You removed: " + ctArray[i].color);
                ctArray[i] = null;
                break;
            }
        }
            return null;
    }

    ThingContainer(int x) {
        thingLimit = x;
    }

    public static void main(String[] args) {

        ColorfulThing c1 = ThingContainer.add();
        ColorfulThing c2 = ThingContainer.add();
        ColorfulThing c3 = ThingContainer.add();
        ColorfulThing c4 = ThingContainer.add(); //didn't add cuz full
        ColorfulThing c5 = ThingContainer.add(); //didn't add cuz full

        if(ThingContainer.remove(Color.BLOODRED) == null) {
            System.out.println("Cannot return ColorfulThing of that color.");
        }
    }









}

/*    int thingLimit; //thingLimit 5
    boolean full = false; //starts off not full

    ArrayList<ColorfulThing> myColorfulThings = new ArrayList<ColorfulThing>();

    ThingContainer(int x) {
        thingLimit = x;

    }


    public static void main(String[] args) {

        ThingContainer myThingContainer = new ThingContainer(5);  //thingLimit 5


        while (!myThingContainer.full) {
            myThingContainer.thingLimit--;
            myThingContainer.myColorfulThings.add(new ColorfulThing(Color.CAFEMOCHA));

            for(ColorfulThing x:myThingContainer.myColorfulThings) {  //for each ColorfulThing in myThingContainer.myColorfulThings
                System.out.println(x.color.toString());  //prints for every line of colorful things
            }
            System.out.println(); //prints blank line in between each iteration
            if (myThingContainer.thingLimit == 0) {
                System.out.println("ThingContainer is full.");
                myThingContainer.full = true;
            }

        }

        for(int i = 4; i > -1; i--) {
            myThingContainer.myColorfulThings.remove(i); //removing all the Things by 1 to 0
            System.out.println("Removed Thing in Index Position: " + i);
        }


    }
}

//using ArrayLists, you can .add and .remove so you don't need to make logic from scratch
*/