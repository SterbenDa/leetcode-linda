package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q7Test {

    private Q7 sut = new Q7();

    @Test
    public void test_1() {
        // Arrange

        // Act
        int result = sut.reverse(123);

        // Assert
        assertThat(result).isEqualTo(321);
    }

    @Test
    public void test_2() {
        // Arrange

        // Act
        int result = sut.reverse(-123);

        // Assert
        assertThat(result).isEqualTo(-321);
    }

    @Test
    public void test_3() {
        // Arrange

        // Act
        int result = sut.reverse(1534236469);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test_4() {
        // Arrange

        // Act
        int result = sut.reverse(-2147483648);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test_5() {
        // Arrange

        // Act
        int result = sut.reverse(-1563847412);

        // Assert
        assertThat(result).isEqualTo(0);
    }
}