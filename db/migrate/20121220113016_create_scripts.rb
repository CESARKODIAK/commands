class CreateScripts < ActiveRecord::Migration
  def change
    drop_table :scripts rescue nil
    create_table :scripts do |t|
      t.string :name
      t.text :text
      t.text :description
      t.integer :user_id
      t.integer :current_id
      t.timestamps
    end
  end
end
