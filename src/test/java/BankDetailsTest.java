import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankDetailsTest {

    @Test
    void deposit() {
        BankDetails b=new BankDetails();
        b.dep_amount=1000;
        assertEquals(1000,b.balance=b.balance+b.dep_amount);
        b.dep_amount=0;
        assertEquals(1000,b.balance=b.balance+b.dep_amount);
    }

    @Test
    void withdrawal() {
        BankDetails b=new BankDetails();
        b.dep_amount=1000;
        assertEquals(1000,b.balance=b.balance+b.dep_amount);

        try{
           b.with_amount=800;
        }catch(Exception e){
            e.printStackTrace();
        }
        assertEquals(200,b.balance=b.balance - b.with_amount);
       // assertThrows(Exception.class,() -> { b.with_amount=201;});
        b.with_amount=0;
        assertEquals(200,b.balance=b.balance-b.with_amount);
        assertDoesNotThrow(() -> {b.with_amount=199; } );
        assertEquals(1,b.balance=b.balance-b.with_amount);
    }
}