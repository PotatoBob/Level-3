
//Copyright Wintriss Technical Schools 2014

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class OncogeneTest {
	@Test
	public void testOncogeneDetector() {
		OncogeneDetector oncogeneDetector = new OncogeneDetector();

		ArrayList<String> healthySequences = new ArrayList<String>();
		healthySequences.addAll(Arrays.asList("TGCATCC AAATTTGGGCCC ATGCGCTA GGGTACGGAG TTAATTGGG".split(" ")));
		ArrayList<String> cancerSequences = new ArrayList<String>();
		cancerSequences.addAll(Arrays.asList(
				"ATTTGCAGG TGCAAATTA AAAGGGCCCTTT TGCGATACGTAGGACCA ACTCATTAGTGC AAACGCTAGACACACAAG".split(" ")));
		
		assertTrue(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "TGC"));
		assertFalse(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "GGG"));
	}

}