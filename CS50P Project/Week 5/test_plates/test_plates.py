from plates import is_valid

def test_length():
    assert is_valid("ASE1256") == False
    assert is_valid("A") == False
    assert is_valid("BGE124") == True

def test_alpha():
    assert is_valid("A1234") == False
    assert is_valid("1234") == False
    assert is_valid("AB C12") == False
    assert is_valid("AB,C12") == False
    assert is_valid("AB.C12") == False
    assert is_valid("MP9875") == True

def test_num():
    assert is_valid("AB012") == False
    assert is_valid("ING098") == False
    assert is_valid("QED0AA") == False
    assert is_valid("AA11AA") == False
    assert is_valid("DFA125") == True

