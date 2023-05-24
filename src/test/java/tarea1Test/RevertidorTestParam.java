package tarea1Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tarea1.Revertidor;

public class RevertidorTestParam {
    @ParameterizedTest
    @CsvSource({
            "12345, 54321",
            "-9876, -6789",
            "0, 0",
            "9, 9",
            "1234567, 7654321",
            "11111, 11111",
            "-555, -555",
            "987654, 456789",
            "-123, -321",
            "100001, 100001",
            "456, 654",
            "7890, 0987",
            "-987654, -456789",
            "888, 888",
            "555, 555",
            "789, 987",
            "-876543, -345678",
            "10001, 10001",
            "987, 789",
            "-1, -1",
            "4321, 1234",
            "999, 999",
            "5432, 2345",
            "123456, 654321",
            "-12345, -54321",
            "777, 777",
            "98743, 34789",
            "24681, 18642",
            "-7654, -4567",
            "2022, 2202",
            "999, 999",
            "1000, 0001",
            "1230, 0321",
            "-8888, -8888",
            "101010, 010101",
            "987654, 456789",
            "-98765, -56789",
            "987100, 001789",
            "876543, 345678",
            "-7777, -7777",
            "0, 0",
            "1001, 1001",
            "13579, 97531",
    })

    public void verifyRevertidor(int  numero, String expectedResult){
        String actualResult = revertidor.invertir(numero);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!, el mensaje retornado es incorrecto verifique el numero" );
    }
    Revertidor revertidor = new Revertidor();
}
