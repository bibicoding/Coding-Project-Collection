from project import encipher, decipher, shifter

def test_encipher():
    assert encipher("", 1) == ""
    assert encipher("BIBI", 2) == "DKDK"
    assert encipher("GIBI", 3) == "JLEL"

def test_decipher():
    assert decipher("") == ""
    assert decipher("0") == "0"
    assert decipher(",.,") == ",.,"

def test_shifter():
    assert shifter("0", 1) == "0"
    assert shifter("", 1) == ""
    assert shifter("BIBI", 2) == "DKDK"
    assert shifter("HELLO, THIS IS CS50", 2) == "JGNNQ, VJKU KU EU50"
    assert shifter("BIBI", -2) == "ZGZG"
    assert shifter("HI", 100) == "DE"


