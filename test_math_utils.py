from math_utils import MathUtils
import pytest
def test_add():
    # Test adding positive numbers
    assert MathUtils.add(5, 7) == 12
    # Test adding negative numbers
    assert MathUtils.add(-3, -2) == -5
    # Test adding a negative and a positive number
    assert MathUtils.add(-5, 10) == 5

def test_subtract():
    # Test normal subtraction
    assert MathUtils.subtract(10, 5) == 5
    # Test result is negative
    assert MathUtils.subtract(5, 10) == -5

def test_multiply():
    # Test multiplying positive numbers
    assert MathUtils.multiply(3, 4) == 12
    # Test multiplying by zero
    assert MathUtils.multiply(5, 0) == 0

def test_divide():
    # Test normal division
    assert MathUtils.divide(10, 2) == 5
    # Test division by zero
    assert MathUtils.divide(5, 0) == -1.0
    # Test division resulting in a decimal
    assert MathUtils.divide(1, 2) == 0.5
