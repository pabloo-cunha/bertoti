import React, {useEffect, useState} from 'react';
import axios from "axios";

const MainPanel = () => {
    // const [produtos, setProdutos] = useState([]);
    // useEffect(() =>
    // const fecthData = async() => {
    //     try{
    //         const response = await axios.post()
    //     }
    // }
    // )
    const panelStyles = {
        backgroundColor: 'rgba(0, 0, 0, 0.5)', // Ajuste a transparência aqui
        padding: '20px',
        borderRadius: '10px',
        margin: '20px',
        boxShadow: '0px 0px 20px rgba(0, 0, 0, 0.3)', // Efeito de sombra para dar aparência 3D
        color: 'white', // Cor do texto para contraste

    };



    const produtos = [
        {
            nome: 'Café Especial Dópio',
            imagem: `${process.env.PUBLIC_URL}/images/Products/Café Especial - Dópio.jpg`,
            intensidade: 'Torra média',
            preco: 35.99,
        },{
            nome: "Café Especial - Serra D'agua",
            imagem: `${process.env.PUBLIC_URL}/images/Products/Café Especial - Serra D'agua.png`,
            intensidade: 'Torra média',
            preco: 25.99,
        }
    ]

    const listaProduto = produtos.map((produtos, index) => (
        <div key={index}>
            <img
                src = {produtos.imagem}
                alt = {produtos.nome}
                style={{ width: '50%', height: 'auto', maxWidth: '200px'}}
            />
            <h3>{produtos.nome}</h3>
            <p>{produtos.descricao}</p>
            <p>Preço: R$</p>
        </div>
    ))

    return (
        <div style={panelStyles}>
            <h2>Produtos em Destaque</h2>
            {/* Adicione aqui a lógica para exibir os itens da sua loja */}
            <div>
                {listaProduto}
            </div>
        </div>
    );
};

export default MainPanel;