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
	private JTextField fieldQuantidade;
	private JTextField FieldValorItem;
	private JTextField fieldSubtotal;

	public JanelaMigLayout() {
		setTitle("M\u00F3dulo PVD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(
				new MigLayout("", "[grow][grow][grow][grow]", "[][grow][grow][grow][grow][grow][][grow][][][][][][grow][][grow]"));

		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblCod, "cell 0 0");

		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDesc.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblDesc, "cell 1 0");

		fieldCodigo = new JTextField();
		contentPane.add(fieldCodigo, "cell 0 1,grow");
		fieldCodigo.setColumns(10);

		fieldDescricao = new JTextField();
		contentPane.add(fieldDescricao, "cell 1 1 2097051 1,grow");
		fieldDescricao.setColumns(10);

		JLabel lblPreco = new JLabel("Pre\u00E7o");
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblPreco, "cell 3 2,alignx leading,aligny baseline");

		fieldPreco = new JTextField();
		contentPane.add(fieldPreco, "cell 3 3,grow");
		fieldPreco.setColumns(10);

		textArea = new JTextArea();
		contentPane.add(textArea, "cell 0 4 3 10,grow");

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblQuantidade, "cell 3 4");

		fieldQuantidade = new JTextField();
		contentPane.add(fieldQuantidade, "cell 3 5,grow");
		fieldQuantidade.setColumns(10);

		JLabel lblValorItem = new JLabel("Valor do item");
		lblValorItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblValorItem, "cell 3 6");

		FieldValorItem = new JTextField();
		contentPane.add(FieldValorItem, "cell 3 7,grow");
		FieldValorItem.setColumns(10);

		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSubTotal, "cell 3 12");

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
