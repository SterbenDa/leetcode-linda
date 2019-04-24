package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class Q62Test {

    private Q62 sut = new Q62();

    @Test
    public void test_1() {
        // Arrange

        // Act
        int result = sut.uniquePaths(3, 2);

        // Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test_2() {
        // Arrange

        // Act
        int result = sut.uniquePaths(7, 3);

        // Assert
        assertThat(result).isEqualTo(28);
    }
}