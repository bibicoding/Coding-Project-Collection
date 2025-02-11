from jar import Jar
import pytest


def test_init():
    with pytest.raises(ValueError):
        Jar(-1)
    with pytest.raises(ValueError):
        Jar(12, 13)


def test_str():
    jar = Jar()
    assert str(jar) == ""
    jar.deposit(1)
    assert str(jar) == "🍪"
    jar.deposit(11)
    assert str(jar) == "🍪🍪🍪🍪🍪🍪🍪🍪🍪🍪🍪🍪"


def test_deposit():
    jar = Jar(12, 1)
    jar.deposit(3)
    assert str(jar) == "🍪🍪🍪🍪"

    with pytest.raises(ValueError):
        jar = Jar(12, 1)
        jar.deposit(11111)


def test_withdraw():
    jar = Jar(12, 8)
    jar.withdraw(4)
    assert str(jar) == "🍪🍪🍪🍪"

    with pytest.raises(ValueError):
        jar = Jar(12, 1)
        jar.withdraw(3)

