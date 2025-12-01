Descrição do App

O Bus School é um aplicativo desenvolvido para motoristas de transporte escolar, oferecendo ferramentas práticas para gerenciar alunos, rotas, cadastros e informações básicas necessárias no dia a dia da operação.
O app torna o processo mais seguro, organizado e eficiente, centralizando tudo em um único ambiente.

Ele foi projetado com foco em:

Simplicidade

Rapidez

Facilidade de navegação

Interface clara

Operação durante a rotina dos motoristas

🖼️ Prints das Telas
📍 Tela Home
<img src="/mnt/data/Captura de tela 2025-12-01 151952.png" width="280"/>
📂 Menu Lateral (Navigation Drawer)
<img src="/mnt/data/Captura de tela 2025-12-01 152013.png" width="280"/>
🧑‍🎓 Tela de Alunos
<img src="/mnt/data/Captura de tela 2025-12-01 152020.png" width="280"/>
📋 Tela de Cadastros
<img src="/mnt/data/Captura de tela 2025-12-01 152027.png" width="280"/>
🛠️ Tecnologias Utilizadas
Frontend (Android)

Kotlin

Android Jetpack:

ViewModel

LiveData

Navigation Component

Fragments

Material Design 3

RecyclerView

ViewBinding

ConstraintLayout

Maps API (se estiver usando a parte do mapa)

Backend (opcional / se existir API)

Python (Flask/FastAPI) ou Node.js (Express)

Banco de dados SQL ou NoSQL
(Se quiser, posso adaptar conforme o backend real.)

⚙️ Como Instalar e Rodar
1. Clonar o repositório
git clone https://github.com/seu-usuario/bus-school.git

2. Abrir no Android Studio

Abra o Android Studio

Clique em Open Project

Selecione a pasta do Bus School

3. Sincronizar o Gradle

O Android Studio faz isso automaticamente, mas você pode forçar por:

File > Sync Project with Gradle Files

4. Rodar o App

Conecte um dispositivo físico ou use um emulador

Clique em Run ▶️

🌐 Endpoints da API (Se houver)

Aqui está o formato padrão — posso substituir pelos reais quando você quiser.

GET /alunos

Retorna todos os alunos.

GET /alunos/{id}

Busca dados de um aluno específico.

POST /alunos

Cadastra um novo aluno.

PUT /alunos/{id}

Atualiza os dados do aluno.

DELETE /alunos/{id}

Remove um aluno.

🔄 Como o CRUD Funciona
Create — Criar

Motorista cadastra novos alunos via formulário → Salvo no banco local ou API.

Read — Ler

A lista de alunos é exibida na tela com RecyclerView.

Update — Atualizar

Informações podem ser editadas em telas específicas.

Delete — Excluir

O aluno pode ser removido diretamente pela listagem.

📚 Funções Implementadas

 Tela Home

 Navigation Drawer

 Tela de Alunos

 Tela de Cadastros

 Botões para cadastro e listagem

 Cadastro completo de responsáveis

 Cadastro de turmas

 Cadastro de escolas

 Cadastro de funcionários

 Integração com API

 Controle de presença

 Sistema de rotas no mapa

 Notificações