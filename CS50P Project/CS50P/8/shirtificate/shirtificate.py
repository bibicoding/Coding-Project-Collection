from fpdf import FPDF

class PDF(FPDF):
    def header(self):
        self.image("./shirtificate.png", 10, 70, 190)
        self.set_font("helvetica", "B", 50)
        self.cell(0, 60, "CS50 Shirtificate", align = "C")
        self.ln(20)


def main():
    name = input("Name: ")
    shirt(name)


def shirt(name):
    pdf = PDF()
    pdf.add_page()
    pdf.set_font("helvetica", size = 30)
    pdf.set_text_color(255,255,255)
    pdf.cell(0, 200, f"{name} took CS50", align = "C")
    pdf.output("shirtificate.pdf")


if __name__ == "__main__":
    main()
