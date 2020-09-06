// Maico Triaca Cunha - Informática Biomédica

package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;

public class JanelaMigLayout extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCodigo;
	private JTextField fieldDescricao;
	private JTextField fieldTotal;
	private JTextField fieldForma;
	private JTextField fieldValor;
	private JTextField fieldTroco;
	private JTextField fieldPreco;
	private JTextField fieldQNT;
	private JTextField FieldValorItem;
	private JTextField fieldSubtotal;
	private JTextArea textArea;

	public JanelaMigLayout() {
		setTitle("M\u00F3dulo PVD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(
				new MigLayout("", "[grow][grow][grow][grow]", "[][grow][grow][grow][grow][grow][][grow][][][][][][grow][][grow]"));

		JLabel lblCod = new JLabel("C\u00F3digo");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblCod, "cell 0 0");

		JLabel lblDesc = new JLabel("Descri\u00E7\u00E3o");
		lblDesc.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblDesc, "cell 1 0");

		fieldCodigo = new JTextField();
		contentPane.add(fieldCodigo, "cell 0 1,grow");
		fieldCodigo.setColumns(10);

		fieldDescricao = new JTextField();
		contentPane.add(fieldDescricao, "cell 1 1 2097051 1,grow");
		fieldDescricao.setColumns(10);

		JLabel lblNewLabel = new JLabel("Pre\u00E7o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, "cell 3 2,alignx leading,aligny baseline");

		fieldPreco = new JTextField();
		contentPane.add(fieldPreco, "cell 3 3,grow");
		fieldPreco.setColumns(10);

		textArea = new JTextArea();
		contentPane.add(textArea, "cell 0 4 3 10,grow");

		JLabel lblNewLabel_1 = new JLabel("Quantidade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1, "cell 3 4");

		fieldQNT = new JTextField();
		contentPane.add(fieldQNT, "cell 3 5,grow");
		fieldQNT.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Valor do item");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2, "cell 3 6");

		FieldValorItem = new JTextField();
		contentPane.add(FieldValorItem, "cell 3 7,grow");
		FieldValorItem.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Sub Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3, "cell 3 12");

		fieldSubtotal = new JTextField();
		contentPane.add(fieldSubtotal, "cell 3 13,grow");
		fieldSubtotal.setColumns(10);

		JLabel lblPagar = new JLabel("Total a pagar");
		lblPagar.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblPagar, "cell 0 14");

		JLabel lblForm = new JLabel("Forma de pagamento");
		lblForm.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblForm, "cell 1 14");

		JLabel lblValor = new JLabel("Valor a pagar");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblValor, "cell 2 14,alignx leading,aligny baseline");

		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblTroco, "cell 3 14,alignx leading");

		fieldTotal = new JTextField();
		contentPane.add(fieldTotal, "cell 0 15,grow");
		fieldTotal.setColumns(10);

		fieldForma = new JTextField();
		contentPane.add(fieldForma, "cell 1 15,grow");
		fieldForma.setColumns(10);

		fieldValor = new JTextField();
		contentPane.add(fieldValor, "cell 2 15,grow");
		fieldValor.setColumns(10);

		fieldTroco = new JTextField();
		contentPane.add(fieldTroco, "cell 3 15,grow");
		fieldTroco.setColumns(10);
	}

}
