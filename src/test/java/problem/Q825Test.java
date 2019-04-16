package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q825Test {

    private Q825 sut = new Q825();

    @Test
    public void test_1() {
        // Arrange
        int[] ages = {16, 16};

        // Act
        int result = sut.numFriendRequests(ages);

        // Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test_2() {
        // Arrange
        int[] ages = {16, 17, 18};

        // Act
        int result = sut.numFriendRequests(ages);

        // Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test_3() {
        // Arrange
        int[] ages = {20, 30, 100, 110, 120};

        // Act
        int result = sut.numFriendRequests(ages);

        // Assert
        assertThat(result).isEqualTo(3);
    }
}