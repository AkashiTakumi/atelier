- ユースケース1 ユーザを登録する
  - ユーザがユーザ登録画面にアクセスする．
　システムがユーザ登録画面を表示する．
  - ユーザはユーザ情報登録画面に「ユーザ名」と「メールアドレス」，「パスワード」を入力する．
  - システムは入力された内容で登録してもよいか確認画面を表示する．
  - ユーザはあっていることを確認して登録ボタンを押す．
　 - やめる場合は一つ前のページに戻って入力をやり直す．
  - システムはメールアドレスが存在しないことを確認してユーザリポジトリに情報の登録を行う．
  - システムはログイン画面にリダイレクトする．
- ユースケース2 システムにログインする
  - ユーザは漫画管理アプリのログイン画面にアクセスする．
  - システムがログイン画面を表示する．
  - ユーザはログイン画面に自分のメールアドレスとパスワードを入力する．
  - システムはユーザリポジトリにフォームに入力された情報が存在するか検査する．
  - 存在した場合，システムはその人の漫画管理画面にリダイレクトする．
- ユースケース3 漫画の管理を行う
  - システムはログイン後に漫画管理画面を表示する．
  - システムは漫画リポジトリからその人の登録している漫画のリストを取得する
  - システムは漫画タイトル，最新巻数，新巻購入済ボタンを表示する．
  - ユーザは自分の漫画一覧，最新巻数を確認する．
- ユースケース4 漫画を購入する
  - ユーザは実店舗の本屋で本を買う．
  - ユーザはログイン後漫画管理画面にアクセスする． 
  - システムは管理画面を表示する．
  - ユーザは買った漫画の行にある新刊購入済ボタンを押す
  - システムは漫画リポジトリの巻数を1だけインクリメントする
  - システムは漫画管理画面にリダイレクトして，変更を反映する．
  - ユーザは最新巻が増えていることを確認する．
- ユースケース5 漫画の新規登録をする
  - ユーザは新しい漫画の登録フォームのあるページにアクセスする．
  - システムは漫画登録画面を表示する．
  - ユーザは音声か画像認識で「漫画のタイトル」を入力する．
  - ユーザはプルダウンメニューで「最新巻の巻数」を指定する．
  - ユーザは入力を終えると確認ボタンを押す．
  - システムは入力内容で登録しても良いか確認画面を表示する．
  - ユーザは確認して，良ければ登録ボタンを押す．
  - システムは漫画管理画面にリダイレクトする．
  - ユーザは登録した漫画の行が増えていることを確認する．
- ユースケース6 システムからログアウトする
  - ユーザはログインした状態で漫画管理画面にアクセスする．
  - システムは管理画面を表示する．
  - ユーザは表示されているログアウトボタンを押す．
  - システムはログアウトを受け付け，ログイン画面にリダイレクトする．
- ユースケース7 システムを使用するよう通知をする
  - 開発者は月初めの漫画が出る日(大体毎月3日？)をシステムに登録する．
  - システムは日付が3日になったら，システムに登録しているユーザ全員に機能を使い忘れないようメールを送信する．
  - ユーザはメールが送られてきたことを確認する．
- ユースケース8 漫画のレコメンドをする
  - 開発者が月に一度，適当なタイミングを指定する．
  - システムは指定されたタイミングに漫画サイトからスクレイピングを行う
  - システムは取得した内容と，各ユーザの登録済み漫画を照らし合わせる．
  - 既に登録済みの漫画は省いて，取得した内容をメールですべてのユーザに配信する．
  - ユーザはメールが送られてきたことを確認する．
