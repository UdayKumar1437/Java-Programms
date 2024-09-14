public class WhyInterfaces {
    public static void main(String[] args) {
        Student obj = new Student();
        ChalkPiece chalkObj = new ChalkPiece(); 
        BlackMarker markerObj = new BlackMarker();
        obj.writeOnBoard(markerObj);
    }
}

class Student{
    public void writeOnBoard(ObjectToWriteOnBoard object){
        // System.out.println("I'm Writing");
        object.write();
    }
}

class ChalkPiece implements ObjectToWriteOnBoard{
    public void write()
    {
        System.out.println("I'm writing on board using Chalk Piece");
    }
}

class BlackMarker implements ObjectToWriteOnBoard
{
    public void write(){
        System.out.println("I'm writing on board using Black Colour Marker");
    }
}

interface ObjectToWriteOnBoard{
     void write();
}