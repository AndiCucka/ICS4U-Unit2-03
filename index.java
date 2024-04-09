/*
* The CarStack Class.
*
* @author  Andi Cucka
* @version 1.0
* @since   2024-03-27
*/

import java.util.ArrayList;
import java.util.List;

/**
* The CarStack() class.
*/
public class CarStack {
    /**
    * Declares a private instance variable.
    */
    private List<Object> stackAsList;

    /**
    * The constructor().
    */
    public CarStack() {
        stackAsList = new ArrayList<>();
    }

    /**
    * Checks if stack is empty.
    *
    * @return true if the stack is empty, false otherwise
    */
    public boolean isEmpty() {
        return stackAsList.isEmpty();
    }

    /**
    * Returns stack size.
    *
    * @return the size of the stack
    */
    public int size() {
        return stackAsList.size();
    }

    /**
    * The showStack() method.
    *
    * @return the values as a string
    */
    public String showStack() {
        // StringBuilder to efficiently build the string representation
        final StringBuilder values = new StringBuilder();
        
        // Iterate through the stack elements
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            // Append each element followed by a comma and space
            values.append(stackAsList.get(counter)).append(", ");
        }
        
        // If there are elements in the StringBuilder
        if (values.length() > 0) {
            // Remove the trailing comma and space
            values.delete(values.length() - 2, values.length());
        }
        
        // Return the string representation of the stack
        return values.toString();
    }

    /**
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(Object input) {
        stackAsList.add(input);
    }

    /**
    * This method pops a string from the stack.
    *
    * @return the popped string
    */
    public Object popItem() {
        final Object poppedItem;
        if (!stackAsList.isEmpty()) {
            poppedItem = stackAsList.remove(stackAsList.size() - 1);
        } else {
            poppedItem = null;
        }
        return poppedItem;
    }
}
