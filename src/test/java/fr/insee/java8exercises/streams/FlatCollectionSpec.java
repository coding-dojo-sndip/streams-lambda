package fr.insee.java8exercises.streams;

import org.junit.Test;

import java.util.List;

import static fr.insee.java8exercises.streams.FlatCollection.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FlatCollectionSpec {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(flattenCollection(collection)).hasSameElementsAs(expected);
    }

}
