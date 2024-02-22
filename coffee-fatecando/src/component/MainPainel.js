import React, { useState, useEffect } from 'react';
import axios from 'axios';

const MainPanel = () => {
  const [produtos, setProdutos] = useState([]);
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('https://localhost:8080/products'); // Substitua pela sua URL de API
        setProdutos(response.data);
        setIsLoading(false);
      } catch (error) {
        console.error('Erro ao obter dados da API', error);
      }
    };

    fetchData();
  }, []);

  const panelStyles = {
    backgroundColor: 'rgba(0, 0, 0, 0.5)',
    padding: '20px',
    borderRadius: '10px',
    margin: '20px',
    boxShadow: '0px 0px 20px rgba(0, 0, 0, 0.3)',
    color: 'white',
  };

  if (isLoading) {
    return <div>Carregando...</div>;
  }

  // Verifique se a lista de produtos está vazia
  if (produtos.length === 0) {
    return <div>Sem produtos disponíveis.</div>;
  }

  const listaProduto = produtos.map((produto, index) => (
    <div key={index}>
      <img
        src={produto.imagem}
        alt={produto.nome}
        style={{ width: '50%', height: 'auto', maxWidth: '200px' }}
      />
      <h3>{produto.nome}</h3>
      <p>{produto.descricao}</p>
      <p>Preço: R$ {produto.preco.toFixed(2)}</p>
    </div>
  ));

  return (
    <div style={panelStyles}>
      <h2>Produtos em Destaque</h2>
      <div>{listaProduto}</div>
    </div>
  );
};

export default MainPanel;
