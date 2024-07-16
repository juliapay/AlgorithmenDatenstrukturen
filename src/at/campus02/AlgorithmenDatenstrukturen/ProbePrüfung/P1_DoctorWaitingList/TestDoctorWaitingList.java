package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P1_DoctorWaitingList;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestDoctorWaitingList {

    @Test
    public void testOnePatient() {
        DoctorWaitingList list = new DoctorWaitingList();
        list.addPatientAtLastPos("Hans Zimmermann", "123401011900");
        assertEquals("Hans Zimmermann", list.getFirst().getName());
        assertEquals("Hans Zimmermann", list.getLast().getName());
    }

    @Test
    public void testMultiplePatients() {
        DoctorWaitingList list = new DoctorWaitingList();
        list.addPatientAtLastPos("Gitti Juergens", "471105031950");
        list.addPatientAtLastPos("Sepp Maier", "471225071971");
        list.addPatientAtLastPos("Michaela Burgstaller", "471312071998");
        assertEquals("Gitti Juergens", list.getFirst().getName());
        assertEquals("Michaela Burgstaller", list.getLast().getName());
        assertEquals("Sepp Maier", list.getLast().getPrev().getName());
    }
}
