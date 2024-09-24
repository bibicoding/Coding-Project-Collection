from twttr import shorten

def test_shorten_lowercase():
    assert shorten("twitter") == "twttr"
    assert shorten("aeiou") == ""
    assert shorten("fdsahgf;g") == "fdshgf;g"

def test_shorten_uppercase():
    assert shorten("TWITTER") == "TWTTR"
    assert shorten("AEIOU") == ""
    assert shorten("DSAJFK;AL") == "DSJFK;L"

def test_shorten_compound():
    assert shorten("TwItTeR") == "TwtTR"
    assert shorten("AeIoU") == ""
    assert shorten("JJKLEsdfDFK") == "JJKLsdfDFK"

def test_shorten_numbers():
    assert shorten("123") == "123"
    assert shorten("A1C2E3") == "1C23"
