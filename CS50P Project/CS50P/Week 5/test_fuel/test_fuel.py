from fuel import convert, gauge
import pytest

def test_convert():
    assert convert("1/2") == 50
    assert convert("2/5") == 40

def test_gauge():
    assert gauge(50) == "50%"
    assert gauge(convert("1/3")) == "33%"
    assert gauge(99) == "F"
    assert gauge(1) == "E"
    assert gauge(100) == "F"

def test_error():
    with pytest.raises(ValueError):
        convert("cat/dog")

    with pytest.raises(ZeroDivisionError):
        convert("1/0")


