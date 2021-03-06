# チームatelier CMS要求仕様
## 3. 機能一覧
- (1) ユーザ管理機能
    - システム利用者(以下ユーザ)が自身をシステムに登録する．
    - 登録する際に必要な情報はユーザ名，パスワードの二つのみ．
    - ユーザの削除や更新は必要でない．
- (2) ログイン機能
    - ユーザ名とパスワードを使ってシステムにログインをする．
- (3) 漫画管理機能
    - 漫画の題名と，最新巻の番号と，新巻購入ボタンが一列に並んでいる．
        - 表になっている．
    - 漫画の新規登録を行う．
        - ここで，漫画の題名登録は画像や音声入力など，出来れば手を使わない方向で行う．
        - 巻数選択はプルダウンメニューなど煩わしくない方法で選択を行う．
        - 漫画の削除は必ずしも必要ではない．
    - 漫画購入時に「新巻購入」ボタンを押すことで巻数のインクリメントを行う．
        - 常に持っている漫画の最新が何巻なのかを把握する．
- (4) 漫画レコメンド機能
    - 世間一般に人気な漫画のレコメンドを行う．
    - BooKLiveなどの人気ランキングからスクレイピングしたものを，表示する画面を作成．
    - すでに漫画管理機能に登録済の漫画はレコメンドされないことが望ましい．
- (5) 通知機能
    - 漫画購入時に巻数インクリメントを忘れるとシステムとして意味がなくなる
    - 月初めの漫画が出る時期にリマインドメールを送ることで通知を行う