package theory.lecture_13.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Externalization implements Externalizable {

    public Externalization() {
        System.out.println("конструктор родителя");
    }

    public void writeExternal(ObjectOutput out) throws IOException {

    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}