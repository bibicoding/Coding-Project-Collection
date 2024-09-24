from bank import value

def test_Hello():
    assert value("Hello") == 0
    assert value("Hello, Newman") == 0
    assert value("Hello, Peter") == 0

def test_H():
    assert value("Hey, whassup") == 20
    assert value("Haha") == 20
    assert value("Hoho, hahaha") == 20

def test_100():
    assert value("Yo, how is it doin") == 100
    assert value("Bro, you are hideous") == 100
    assert value("She's cute") == 100

