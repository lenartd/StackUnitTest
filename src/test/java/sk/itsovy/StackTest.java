package sk.itsovy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StackTest {

    Stack<Phone> phoneStack = new Stack<>(10);
    @BeforeEach
    void setUp() {
        try {
            phoneStack.push(new Phone("MI Note 8", "Xiaomi", 6.7, 6, "Mediatek T200"));
            phoneStack.push(new Phone("Galaxy S10", "Samsung", 6.5, 8, "Exynos N5689"));
            phoneStack.push(new Phone("6.1", "Nokia", 6.0, 4, "Mediatek T450"));
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    @AfterEach
    void tearDown() {
        phoneStack = new Stack<>(10);
    }

    @Test
    void isEmpty() {
        assertEquals(false, phoneStack.isEmpty()); //testing when filled up

        try {
            int size = phoneStack.getSize();

            for(int i = 0; i<size; i++)
            {
                phoneStack.pop();
            }

            assertEquals(true, phoneStack.isEmpty()); //testing when empty

            phoneStack.push(null);
            assertEquals(true, phoneStack.isEmpty()); //testing after inserted null
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Test
    void isFull() {
        try {
            assertEquals(false, phoneStack.isFull()); //testing when not full

            int size = phoneStack.getSize();

            for(int i = size; i<phoneStack.getCapacity(); i++)
            {
                phoneStack.push(new Phone("6.1", "Nokia", 6.0, 4, "Mediatek T450"));
            }

            assertEquals(true, phoneStack.isFull()); //testing when full
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }

    @Test
    void push() {
        try {

            int size = phoneStack.getSize();

            phoneStack.push(new Phone("6.1", "Nokia", 6.0, 4, "Mediatek T450"));

            assertEquals(size + 1, phoneStack.getSize()); //testing after object insertion

            phoneStack.push(null);

            assertEquals(phoneStack.getSize(), phoneStack.getSize()); //testing after null insertion
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Test
    void pop() {
        try {
            int size = phoneStack.getSize();
            phoneStack.pop();
            assertEquals(size - 1, phoneStack.getSize()); //testing popping with already inserted values
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Test
    void top() {
        try {
            Phone phone1 = new Phone("MI Note 8", "Xiaomi", 6.7, 6, "Mediatek T200");
            Phone phone2 = new Phone("Galaxy S10", "Samsung", 6.5, 8, "Exynos N5689");

            phoneStack.push(phone2);
            phoneStack.push(phone1);

            assertEquals(phone1, phoneStack.top()); //checking if return the last inserted value

            phoneStack.pop();

            assertEquals(phone2, phoneStack.top()); //checking if after pop returns the right value
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Test
    void topAndPop() {

        try {
            Phone phone1 = new Phone("MI Note 8", "Xiaomi", 6.7, 6, "Mediatek T200");
            Phone phone2 = new Phone("Galaxy S10", "Samsung", 6.5, 8, "Exynos N5689");

            phoneStack.push(phone2);
            phoneStack.push(phone1);

            int size = phoneStack.getSize();


            assertEquals(phone1, phoneStack.topAndPop()); //checking if returns the last inserted value

            assertEquals(size-1, phoneStack.getSize()); //checking if the size lesser after topAndPop

            assertEquals(phone2, phoneStack.top()); //checking if after topAndPop returns the right value
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }

    @Test
    void getSize() {
        try {
            assertEquals(3, phoneStack.getSize()); //checking if returns 3 (3 object is already inserted)

            phoneStack.pop();

            assertEquals(2, phoneStack.getSize()); //checking if the value is 2 after popping
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Test
    void getCapacity() {
        assertEquals(10, phoneStack.getCapacity()); //checking if the capacity equals with the creating capacity
    }

    @Test
    void empty() {

        try {
            assertEquals(false, phoneStack.isEmpty()); //checking with inserted values

            int size = phoneStack.getSize();

            for(int i = 0; i<size; i++)
            {
                phoneStack.pop();
            }

            assertEquals(true, phoneStack.isEmpty()); //checking when empty
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}