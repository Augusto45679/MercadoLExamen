package servicesTest;
import org.example.Main;

import org.example.services.MutantServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ContextConfiguration(classes =Main.class)
public class MutantServiceTest {

    @Autowired
    private MutantServiceImpl mutantServiceImpl;

    @Test
    public void testRows(){
        String[] dna = {"AAAATG","TGCAGT","GCTTCC","CCCCTG","GTAGTC","AGTCAC"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }

    @Test
    public void testDiagonal(){
        String[] dna = {"AGAATG", "TACAGT", "GCAGCC", "TTGATG", "GTAGTC", "AGTCAA"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }
    @Test
    public void testColumn() {
        String[] dna = {"AGAATG", "TGCAGT", "GCTTCC", "GTCCTC", "GTAGTC", "GGTCAC"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }

    @Test
    public void testMainDiagonals() {
        String[] dna = {"AGAATG", "TACAGT", "GCAGCC", "TTGATG", "GTAGTC", "AGTCAA"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }

    @Test
    public void testSecondaryLeftDiagonals() {
        String[] dna = {"ATAATG", "GTTAGT", "GGCTCG","TTGATG","GTAGTC", "AGTCAA"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }

    @Test
    public void testSecondaryRightDiagonals() {
        String[] dna = {"ATAATG", "GTATGA", "GCTTAG", "TTTAGG", "GTAGTC", "AGTCAA"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }

    @Test
    public void testTertiaryLeftDiagonals() {
        String[] dna = {"ATGATG", "GTAGTA","CCTTGG", "TCTAGG", "GGCGTC", "AGTCAA" };
        assertTrue(mutantServiceImpl.isMutant(dna));
    }

    @Test
    public void testTertiaryRightDiagonals() {
        String[] dna = {"ATGATG", "GTATTA", "AATTGG", "ACTAGT", "GGAGTC", "AGGCAA"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }

    @Test
    public void testNonMutant() {
        String[] dna = {"ATGATG", "GTCTTA", "AATTGG", "ACTAGT", "GGATTC", "AGGCAA"};
        assertFalse(mutantServiceImpl.isMutant(dna));
    }
    @Test
    public void testMutant4(){
        String[] dna = {"TTTTTTTTT","TTTTTTTTT", "TTTTTTTTT", "TTTTTTTTT", "CCGACCAGT","GGCACTCCA", "AGGACACTA", "CAAAGGCAT", "GCAGTCCCC"};
        assertTrue(mutantServiceImpl.isMutant(dna));
    }
}
