from um import count

def test_um():
    assert count("hello, world") == 0
    assert count("hello, um, world") == 1
    assert count("um") == 1
    assert count("UM") == 1
    assert count("UMUMumum") == 0

def test_WordsWithUm():
    assert count("yummy") == 0
    assert count("numpy") == 0
    assert count("ummmm yummy numpy bumpy um") == 1
    assert count("dumb") == 0

def test_other():
    assert count("465465") == 0
    assert count("bibi") == 0
