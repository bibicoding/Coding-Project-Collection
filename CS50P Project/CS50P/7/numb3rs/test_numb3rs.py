from numb3rs import validate

def test_255():
    assert validate("0.0.0.0") == True
    assert validate("123.123.123.25") == True
    assert validate("256.12.45.255") == False
    assert validate("256.987.123.456") == False

def test_shorten():
    assert validate("0") == False
    assert validate("1.2") == False
    assert validate("2.0.") == False
    assert validate("23.58.123") == False

def test_lengthen():
    assert validate("1.2.3.1.2.3") == False
    assert validate("1.2.3.1.2.3....") == False

def test_alphanumeric():
    assert validate("1+2+3*/") == False
    assert validate("1,2,3,4") == False

def test_first():
    assert validate("123.789.789.789") == False

