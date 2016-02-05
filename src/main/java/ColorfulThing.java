/**
 * Created by Tenny on 2/4/16.
 */
enum Color {
    CAFEMOCHA, ORANGINA, MOUNTAINDEWGREEN, BLOODRED
}

public class ColorfulThing {

    Color color; //instance variable

    //constructor is public even without "public" because it defaults to the class it is in
    public ColorfulThing(Color x) {
        color = x; //initialized

    }

    public Color getColor() {
        return color;
    }

}
