package io.barisdere.java.newfeatures;

public record RecordPoint(int x, int y) {

    public static void main(String[] args) {
        RecordPoint recordPoint = new RecordPoint(1, 5);
//        recordPoint.x = 7;
    }
}
