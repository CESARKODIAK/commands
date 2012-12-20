class CreateParameters < ActiveRecord::Migration
  def change
    create_table :parameters do |t|
      t.string :name
      t.string :default
      t.integer :kind_id
      t.integer :method_id

      t.timestamps
    end
  end
end
